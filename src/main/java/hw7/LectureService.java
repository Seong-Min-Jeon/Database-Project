package hw7;

import hw7.domain.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@org.springframework.stereotype.Service
public class LectureService {
    @Autowired
    private LectureRepository repository;

    // 1.a를 위한 함수
    public List<LectureEntity> findAllLectures() {
        List<LectureEntity> tracking = repository.findAllLectures();
        System.out.println(tracking);
        return tracking;
    }

}
