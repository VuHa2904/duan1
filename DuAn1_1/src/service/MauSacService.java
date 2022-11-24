package service;

import java.util.List;
import model.MauSac;

public interface MauSacService {

    List<MauSac> getAll();

    String Add(MauSac ms);

    String delete(String ma);

    String update(MauSac ms, String ma);

    MauSac getOne(String ma);
}
