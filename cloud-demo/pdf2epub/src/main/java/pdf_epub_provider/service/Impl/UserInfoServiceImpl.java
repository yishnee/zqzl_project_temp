package pdf_epub_provider.service.Impl;

import org.springframework.stereotype.Service;
import pdf_epub_provider.service.UserInfoService;

import java.util.List;

@Service
public class UserInfoServiceImpl implements UserInfoService {

    //TODO 判定用户名和路径是否违法
    @Override
    public boolean isPathValid(String path, String username) {
        return true;
    }


    @Override
    public List<String> findAllPath(String username) {
        return null;
    }
}
