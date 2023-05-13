package ru.baydak.pastebox.api.response;

import lombok.Data;
import ru.baydak.pastebox.api.request.PublicStatus;

@Data
public class PastboxResponse {
    private String data;
    private PublicStatus status;
}
