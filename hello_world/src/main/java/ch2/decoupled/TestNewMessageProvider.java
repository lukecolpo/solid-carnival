package ch2.decoupled;

public class TestNewMessageProvider implements MessageProvider {
    @Override
    public String getMessage(){ return "this is a test";}
}
