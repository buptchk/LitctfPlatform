package com.litchi.litchi_ctf.service;

import com.litchi.litchi_ctf.pojo.Notice;
import com.litchi.litchi_ctf.pojo.Rank;

import java.util.List;

public interface LocalService {
    public int getUserNumber();
    public List<Notice> getNoticeList();
}
