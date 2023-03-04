package uz.b.asaxiyuz.entity;

import lombok.*;
import uz.b.asaxiyuz.base.BaseEntityUUID;
import uz.b.asaxiyuz.enums.FileStatus;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Attachment extends BaseEntityUUID {

    private String name;

    private String originalName;
    @Column(nullable = false)
    private String contentType;
    @Column(nullable = false)
    private Long size;
    private String fullPath;
    private String directory;
    @Enumerated(value = EnumType.STRING)
    private FileStatus fileStatus;
}



