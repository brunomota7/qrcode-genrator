package com.qrcode.generator.controller;

import com.qrcode.generator.dto.qrcodeDTO.QrCodeGenerateRequest;
import com.qrcode.generator.dto.qrcodeDTO.QrCodeGenerateResponse;
import com.qrcode.generator.service.QrCodeGenerateService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/qrcode")
public class QrCodeController {

    private final QrCodeGenerateService qrCodeGenerateService;

    public QrCodeController(QrCodeGenerateService qrCodeService) {
        this.qrCodeGenerateService = qrCodeService;
    }

    @PostMapping
    public ResponseEntity<QrCodeGenerateResponse> genarate(@RequestBody QrCodeGenerateRequest request) {
        try {
            QrCodeGenerateResponse response = qrCodeGenerateService.generateAndUploadQrCode(request.text());
            return ResponseEntity.ok(response);
        } catch (Exception ex) {
            return ResponseEntity.internalServerError().build();
        }
    }
}
