package start.self;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LottoProgram {
    public static void main(String[] args) {
        int rows = 5;
        final int NUMBERS_PER_ROW = 6;
        final int MAX_NUM = 45;

        System.out.println("=== 로또번호 자동추첨 결과 ===");
        List<Integer> lottoNumbers = new ArrayList<>();
        for(int number = 0; number < MAX_NUM; number++) {
            lottoNumbers.add(number + 1);
        }

        for(int i = 0; i < rows; i++) {
            Collections.shuffle(lottoNumbers);
            List<Integer> selectedNumbers = lottoNumbers.subList(0, NUMBERS_PER_ROW);
            Collections.sort(selectedNumbers);
            System.out.println(selectedNumbers);
        }

    }
}
