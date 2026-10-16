public class Dishwasher {

    private boolean hasWorkToDo;

    public Dishwasher(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void doDishes() {
        if (hasWorkToDo) {
            IO.println("Doing dishes");
            hasWorkToDo = false;
        }
    }
}
