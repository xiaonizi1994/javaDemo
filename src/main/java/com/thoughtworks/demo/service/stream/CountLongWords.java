package com.thoughtworks.demo.service.stream;

import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

@Service
public class CountLongWords {
    public void getLongWordsCount() throws IOException {
        String contents = new String(Files.readAllBytes(Paths.get("/Users/ynpan/Documents/Java demo/src/main/java/com/thoughtworks/demo/service/stream/book"))
                , StandardCharsets.UTF_8);
        List<String> words = Arrays.asList(contents.split("\\PL+"));

        long count = 0;

        for (String w : words) {
            if (w.length() > 4)
                count++;
        }
        System.out.println(count);

        count = words.stream().filter(w -> w.length() > 4).count();
        System.out.println(count);

        count = words.stream().parallel().filter(w -> w.length() > 4).count();

        System.out.println(count);
    }
}
