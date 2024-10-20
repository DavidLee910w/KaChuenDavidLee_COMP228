package MidtermRevision.AdvancedOOP;


    enum TrafficLight {
        GREEN(45), YELLOW(5), RED(30);

        private int duration;

        TrafficLight(int duration) {
            this.duration = duration;
        }

        public int getDuration() {
            return duration;
        }
    }
    public class q2 {
        public static void main(String[] args) {
            for (TrafficLight light : TrafficLight.values()) {
                System.out.println(light + " light - " + getMessage(light));
            }
        }
            public static String getMessage (TrafficLight light) {
                switch (light) {
                    case GREEN:
                        return "GO for "+ light.getDuration() + " seconds";
                    case YELLOW:
                        return "SLOW DOWN for " + light.getDuration() + " seconds";
                    case RED:
                        return "STOP for " + light.getDuration() + " seconds";
                    default:
                            return "";
                }
            }
    }

