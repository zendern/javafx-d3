package com.github.javafxd3.demo.client.democases.geom.voronoi;

import com.github.javafxd3.api.core.Value;
import com.github.javafxd3.api.functions.KeyFunction;

import javafx.scene.web.WebEngine;
import netscape.javascript.JSObject;

public class PolygonKeyFunction implements KeyFunction<String> {
	
	//#region ATTRIBUTES
	
	private WebEngine webEngine;
	
	//#end region
	
	//#region CONSTRUCTORS
	
	public PolygonKeyFunction(WebEngine webEngine){
		this.webEngine = webEngine;		
	}
	
	//#end region
	
	//#region METHODS
	
	@Override
	public String call(final Object context, final Object newDataArray, final Object datum, final int index) {
		
		JSObject jsObject = (JSObject) datum;
		Value value = new Value(webEngine, jsObject);
		
		String polygon = VoronoiTessellationDemo.polygon(webEngine, value);
		return polygon;
	}
		
	
	//#end region
	
	
}
