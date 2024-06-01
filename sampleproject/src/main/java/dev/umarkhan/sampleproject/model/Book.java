package dev.umarkhan.sampleproject.model;

import java.time.LocalDateTime;
import java.util.Date;

public record Book(
    Integer id,
    String title,
    String author,
    String datePublished
) {

}
