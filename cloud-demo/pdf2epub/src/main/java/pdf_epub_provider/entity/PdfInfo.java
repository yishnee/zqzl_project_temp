package pdf_epub_provider.entity;

import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Accessors(chain = true)
@Table(name = "pdf")
@Entity
public class PdfInfo implements Serializable {

    //保存的pdf地址
    private String savePath;
    //文件大小
    private long size;
    //保存时间
    private String saveTime;
    //页数
    private Integer pageNum;
    //文件名称
    private String pdfName;
    //是否是用户上传的
    private boolean isUpload;
    //用户Id
    private Integer userId;
    //分割后的pdf集合地址
    @Id
    private String splitPath;

}
