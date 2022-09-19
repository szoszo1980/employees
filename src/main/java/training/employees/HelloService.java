package training.employees;

import lombok.AllArgsConstructor;

//@Service
@AllArgsConstructor
public class HelloService {

    private TimeMachine timeMachine;

    public String sayHello() {
        return "Hello from devtools4 service! " + timeMachine.now();
    }
}