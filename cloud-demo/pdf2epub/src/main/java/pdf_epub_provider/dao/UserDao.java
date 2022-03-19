package pdf_epub_provider.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import pdf_epub_provider.entity.User;

public interface UserDao extends JpaRepository<User,Integer> {
    public User findByUsername(String name);
}
