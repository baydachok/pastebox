package ru.baydak.pastebox.service;

import ru.baydak.pastebox.api.response.PastboxResponse;
import ru.baydak.pastebox.api.request.PasteBoxRequest;
import ru.baydak.pastebox.api.response.PasteboxUrlResponse;

import java.util.List;

public interface PastboxService {
    PastboxResponse getByHash(String hash);
    List<PastboxResponse> getFirstPublicPasteboxes(int amount);
    PasteboxUrlResponse create(PasteBoxRequest request);

}
