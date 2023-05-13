package ru.baydak.pastebox.service;

import ru.baydak.pastebox.api.request.PasteBoxRequest;
import ru.baydak.pastebox.api.response.PastboxResponse;
import ru.baydak.pastebox.api.response.PasteboxUrlResponse;

import java.util.List;

public class PasteboxServiceImpl implements PastboxService{


    @Override
    public PastboxResponse getByHash(String hash) {
        return null;
    }

    @Override
    public List<PastboxResponse> getFirstPublicPasteboxes(int amount) {
        return null;
    }

    @Override
    public PasteboxUrlResponse create(PasteBoxRequest request) {
        return null;
    }
}
