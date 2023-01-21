package JAVA_basic_17;

public class LeastJob implements Scheduler {

    @Override
    public void getNextCall() {
        System.out.println("상담 전화를 순서대로 대기열에서 가져옵니다.");
    }

    @Override
    public void sendCallToAgent() {
        System.out.println("업무가 많지 않은 직원에게 배분합니다.");
    }
    
}
