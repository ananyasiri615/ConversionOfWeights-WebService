package com.ars;

public class WeightConversionImpl implements WeightConversion{
	
	@Override
	public double KToP(Weights w) {
		
		return w.getWeight()*2.205;
	}

	@Override
	public double PToK(Weights w) {
		return w.getWeight()/2.205;
	}

}
