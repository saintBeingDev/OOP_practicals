package Practice.Assign10;


public abstract class Car {
    private CarType model;
    Car(CarType model){
        this.model = model;
    }

    public CarType getModel() {
        return model;
    }

    public void setModel(CarType model) {
        this.model = model;
    }

    protected abstract void construct();
}
