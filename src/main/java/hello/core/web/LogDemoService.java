package hello.core.web;

import hello.core.common.MyLogger;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LogDemoService {

    //provider 사용시
//    private final ObjectProvider<MyLogger> myLoggerProvider;
    //proxy 사용시
    private final MyLogger myLogger;

    public void logic(String id) {
        //provider 사용시
//        MyLogger myLogger = myLoggerProvider.getObject();
        myLogger.log("service id = " + id);
    }
}
