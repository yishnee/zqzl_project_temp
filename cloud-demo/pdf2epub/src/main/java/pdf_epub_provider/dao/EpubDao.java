package pdf_epub_provider.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import pdf_epub_provider.entity.EpubInfo;

public interface EpubDao extends JpaRepository<EpubInfo,Integer> {
}
