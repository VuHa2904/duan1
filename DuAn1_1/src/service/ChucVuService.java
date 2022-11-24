package service;

import java.util.List;
import model.ChucVu;

public interface ChucVuService {

    List<ChucVu> getAll();

    String Add(ChucVu cv);

    String delete(String ma);

    String update(ChucVu cv, String ma);

    ChucVu getOne(String ma);
}
