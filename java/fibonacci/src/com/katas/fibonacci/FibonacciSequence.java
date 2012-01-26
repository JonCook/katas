package com.katas.fibonacci;

public class FibonacciSequence {

	public int getNumberAtPosition(int position) {
		if(position > 1)
			return getNumberAtPosition(position-1) + getNumberAtPosition(position-2);
		return position;
	}

	public int[] generate(int sequenceNumber) {
		int[] fibonacciSequence = new int[sequenceNumber];
		if(sequenceNumber<8 || sequenceNumber>50){
			throw new IllegalArgumentException("Sequence numbers must be between 8 and 50");
		}
		for(int position=0; position<sequenceNumber; position++){
			fibonacciSequence[position] = getNumberAtPosition(position);
		}
		return fibonacciSequence;
	}

}
