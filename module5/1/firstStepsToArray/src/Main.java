
public class Main {
    public static void main(String[] args) {

        float[] patientTemperature = new float[30];

        for (int i = 0; i < patientTemperature.length; i++)
        {
            float value = (float) (32 + (8 * Math.random()));
            patientTemperature[i] = value;
        }

        System.out.println("Average temperarure: " + averageTemperature(patientTemperature));
        System.out.println("Number of healthy: " + numberHealthy(patientTemperature));

    }

    static float averageTemperature(float[] arrayTemperature) {

        float sum = 0;
        for (int i = 0; i < arrayTemperature.length; i++)
        {
            sum += arrayTemperature[i];
        }

        float averageTemperature = sum / arrayTemperature.length;
        return averageTemperature;
    }


    static float numberHealthy(float[] arrayTemperature)
    {
        int sum = 0;
        for (int i = 0; i < arrayTemperature.length; i++)
        {
            if (arrayTemperature[i] >= 36.2 && arrayTemperature[i] <= 36.9)
            {
                sum++;
            }
        }
        return sum;
    }
}