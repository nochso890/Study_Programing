package com.study.modern.junit.study;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;
import java.util.function.Supplier;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class StudyTest {

    @Test
    @DisplayName("Create Study")
    void create_new_study(){
        Study study = new Study(1);
        assertNotNull(study);
        assertEquals(StudyStatus.DRAFT,study.getStatus(),"스터디를 처음 만들면 Draft 여야 한다.");
        assertEquals(StudyStatus.DRAFT, study.getStatus(), new Supplier<String>() { // lambda 로 변경 가능. () -> ""; 최대한 필요시 에 한다. (성능중요시사용)
            @Override
            public String get() {
                return "스터디를 처음 만들면 상태값이 Draft 여야 한다";
            }
        });
        assertTrue(study.getLimit() > 0,"스터디 인원은 0 보다 커야 합니다."); // 위에서 실패시 실행되지 않음.

        assertAll( // 묶어서 테스트 실행하는 방법
            () -> assertNotNull(study),
            () -> assertEquals(StudyStatus.DRAFT,study.getStatus(),"스터디 처음 만들면 "+StudyStatus.DRAFT+" 상태야 합니다."),
            () -> assertTrue(study.getLimit() > 0, ()->"스터디 인원은 0보다 커야 한다.")
        );

        IllegalArgumentException exception= assertThrows(IllegalArgumentException.class, () -> new Study(-10));
        String message = exception.getMessage();
        assertEquals("limit 은 0 보다 커야한다.",message);

        assertTimeout(Duration.ofMillis(100), ()->{ //테스트 코드의 실행 시간 체크.
            new Study(10);
            Thread.sleep(10);

        });

        assertTimeoutPreemptively(Duration.ofMillis(100),()->{ // 시간 초과시 강제로 종료.
            new Study(10);
            Thread.sleep(150);
        });
        //TODO ThreadLocal 알아보기.

    }

}
