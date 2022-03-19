package pdf_epub_provider.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import pdf_epub_provider.entity.PdfInfo;

public interface PdfInfoDao extends JpaRepository<PdfInfo,Integer> {

}
