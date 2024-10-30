package io.sdal.string.manipulation;

import java.util.ArrayList;
import java.util.List;

/**
 * 1. 로그의 가장 앞부분은 식별자로서, 순서에 영향을 끼치지 않는다.
 * 2. 문자로 구성된 로그가 숫자 로그보다 앞에 오며, 문자 로그는 사전순으로 한다.
 * 3. 문자가 동일할 경우에는 식별자순으로 한다.
 * 4. 숫자 로그는 입력 순서대로 한다.
 */
public class ReorderLogFiles {

    public static String[] sortLogs(String[] logs) {
        List<String> letterLogs = new ArrayList<>();
        List<String> digitLogs = new ArrayList<>();

        // 분리작업
        for (String log : logs) {
            String[] split = log.split(" ", 2);
            if (Character.isDigit(split[1].charAt(0))) {
                digitLogs.add(log);
            } else {
                letterLogs.add(log);
            }
        }

        // 문자 로그 정렬
        letterLogs.sort((log1, log2) -> {
            String[] split1 = log1.split(" ", 2);
            String[] split2 = log2.split(" ", 2);

            int cmp = split1[1].compareTo(split2[1]);
            if (cmp != 0) {
                return cmp; // 내용 기준 정렬
            }
            return split1[0].compareTo(split2[0]); // 식별자 기준 정렬
        });

        // 정렬된 문자 로그와 숫자 로그 결합
        letterLogs.addAll(digitLogs);

        return letterLogs.toArray(new String[0]);
    }
}
