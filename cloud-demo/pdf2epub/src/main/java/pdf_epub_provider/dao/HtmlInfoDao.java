package pdf_epub_provider.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import pdf_epub_provider.entity.HtmlInfo;

public interface HtmlInfoDao extends JpaRepository<HtmlInfo,Integer> {
}
