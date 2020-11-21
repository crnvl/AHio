package Core;

import Processing.NeuralNetwork;

import java.util.List;

public class Driver {

    static double [][] X= {
            {0,0},
            {5,0},
            {0,5},
            {5,5}
    };
    static double [][] Y= {
            {0},{5},{5},{0}
    };

    public static void main(String[] args) {
        NeuralNetwork nn = new NeuralNetwork(2,10,1);
        List<Double>output;

        nn.fit(X, Y, 500000);
        double [][] input = {
                {0,0},{0,5},{5,0},{5,5}
        };
        for(double d[]:input)
        {
            output = nn.predict(d);
            System.out.println(output.toString());
        }
    }
}
