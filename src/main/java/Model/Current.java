package Model;


public class Current {

   private String last_updated_epoch;
   private String last_updated;
   private int temp_c;

   public Current (){

   }


   int temp_f;
   int is_day;
   Condition condition;
   double wind_mph;
   double wind_kph;
   int wind_degree;
   String wind_dir;
   int pressure_mb;
   double pressure_in;
   double precip_mm;
   double precip_in;
   int humidity;
   int cloud;
   double feelslike_c;
   double feelslike_f;
   int vis_km;
   int vis_miles;
   int uv;
   private double gust_mph;

    public String getLast_updated_epoch() {
        return last_updated_epoch;
    }

    public String getLast_updated() {
        return last_updated;
    }

    public int getTemp_c() {
        return temp_c;
    }

    public int getTemp_f() {
        return temp_f;
    }

    public int getIs_day() {
        return is_day;
    }

    public Condition getCondition() {
        return condition;
    }

    public double getWind_mph() {
        return wind_mph;
    }

    public double getWind_kph() {
        return wind_kph;
    }

    public int getWind_degree() {
        return wind_degree;
    }

    public String getWind_dir() {
        return wind_dir;
    }

    public int getPressure_mb() {
        return pressure_mb;
    }

    public double getPressure_in() {
        return pressure_in;
    }

    public double getPrecip_mm() {
        return precip_mm;
    }

    public double getPrecip_in() {
        return precip_in;
    }

    public int getHumidity() {
        return humidity;
    }

    public int getCloud() {
        return cloud;
    }

    public double getFeelslike_c() {
        return feelslike_c;
    }

    public double getFeelslike_f() {
        return feelslike_f;
    }

    public int getVis_km() {
        return vis_km;
    }

    public int getVis_miles() {
        return vis_miles;
    }

    public int getUv() {
        return uv;
    }

    public double getGust_mph() {
        return gust_mph;
    }

    public double getGust_kph() {
        return gust_kph;
    }

    private double gust_kph;

}
