package com.ms.instagram.pages;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.upload.Upload;
import com.vaadin.flow.component.upload.receivers.MemoryBuffer;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

import java.io.InputStream;

@PageTitle("Instagram . Create Post")
@Route(value = "/post", layout = MainPage.class)
public class CreatePostPage extends VerticalLayout {
    CreatePostPage() {
        setDefaultHorizontalComponentAlignment(Alignment.CENTER);

        MemoryBuffer memoryBuffer = new MemoryBuffer();
        Upload fileUpload = new Upload(memoryBuffer);
        fileUpload.setAcceptedFileTypes("image/*");

        setPadding(true);

        fileUpload.addSucceededListener(event -> {
            InputStream fileData = memoryBuffer.getInputStream();
            String fileName = event.getFileName();
            long contentLength = event.getContentLength();
            String mimeType = event.getMIMEType();
        });

        add(fileUpload);
    }
}
