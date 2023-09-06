import java.util.*;
import java.lang.Math;

public class Method2double {

	public static void printMat(double mat[][]) {
			for (double[] row:mat) {
			System.out.println(Arrays.toString(row));
		}
	}
	
	public static double randomDouble() {
		double max = 1000;
		double min = -1000;
		double range = (long)max - (long)min + 1;
		double rand = (Math.random()*range) + min;
		return rand;
	}
	
	public static void main(String[] args) {
		double matMax = 1500;
		double matMin = 1400;
		double rangeSize = matMax - matMin + 1;
		int randSize1 = (int) (Math.random()*rangeSize + matMin);
		int randSize2 = (int) (Math.random()*rangeSize + matMin);
		int randSize3 = (int) (Math.random()*rangeSize + matMin);
		double matX[][] = new double[randSize1!=randSize2? randSize2 :randSize2+1][randSize1];
		double matY[][] = new double[randSize1][randSize2!=randSize1? randSize3 :randSize3+1];
		
		for(int i=0; i<matX.length; i++) {
			for(int j=0; j<matX[i].length; j++) {
				matX[i][j] = randomDouble();
			}
		}
		
		for(int i=0; i<matY.length; i++) {
			for(int j=0; j<matY[i].length; j++) {
				matY[i][j] = randomDouble();
			}
		}
		
		/*
		double[][] matX = {{3,4},
						{7,2},
						{5,9}};
		printMat(matX);
		
		double[][] matY = {{3,1,5},
						{6,9,7}};
		System.out.println();
		printMat(matY);
		*/
		
		System.out.println();
		printMat(matX);
		System.out.println();
		printMat(matY);
		
		
		double[][] matZ = new double[matX.length][matY[0].length];
		//System.out.println();
		//printMat(matZ);
		
		for(int k=0; k<matY[0].length; k++) {
			for(int i=0; i<matX.length; i++) {
				//System.out.println(Arrays.toString(matX[i]));
				for(int j=0; j<matX[0].length; j++) {
					//System.out.println(matZ[i][k]);
					///*for(double j2=0; j2<matY[0].length; j2++) {
						matZ[i][k] = matZ[i][k] + matX[i][j]*matY[j][k]; 
					//}*/
				}
				//System.out.println(matZ[i][k]);
			}
		}
		
		System.out.println();
		printMat(matZ);
		
	}
}
