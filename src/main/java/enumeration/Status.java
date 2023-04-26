package enumeration;

public enum Status {
    ACCEPTED("Accepted") {
        private String message = "Car accepted to Car service";

        @Override
        public String getMessage() {
            return message;
        }
    },

    IN_WORK("In work") {
        private String message = "Car is in work";

        @Override
        public String getMessage() {
            return message;
        }
    },
    WAITING("Waiting") {
        private String message = "Car is waiting parts";

        @Override
        public String getMessage() {
            return message;
        }
    },
    FINISHED("Fix is finished") {
        private String message = "All works are over";

        @Override
        public String getMessage() {
            return message;
        }
    };

    private String info;

    Status(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }

    public abstract String getMessage();
}


