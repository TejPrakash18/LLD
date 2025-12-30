package designpatterns.state;

public class Context {
    private State currentState;

    public Context() {
        this.currentState = new RedLightState(); // default state.....
    }
    public void setCurrentState(State state){
        this.currentState = state;
    }
    public void changeLight(){
        currentState.handleRequest(this);
    }
}
