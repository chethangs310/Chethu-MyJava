package JavaGrpTask;

    interface Camera {
        void takePhoto();
        void recordVideo();
        void zoomIn();
    }

    interface Call {
        void makeCall(String phoneNumber);
        void endCall();
        void checkCallHistory();
    }

     class Phone implements Camera,Call {

        public void takePhoto() {
            System.out.println("Taking a photo");
        }

        public void recordVideo() {
            System.out.println("Recording a video");
        }

        public void zoomIn() {
            System.out.println("Zoom the Photo");
        }

        public void makeCall(String phoneNumber) {
            System.out.println("Making a call to: " + phoneNumber);
        }

        public void endCall() {
            System.out.println("Ending the call");
        }

        public void checkCallHistory() {
            System.out.println("Checking call history");
        }

        public static void main(String[] args) {

            Phone p = new Phone();
            p.takePhoto();
            p.recordVideo();
            p.zoomIn();

            p.makeCall("566721223");
            p.endCall();
            p.checkCallHistory();

        }

    }
