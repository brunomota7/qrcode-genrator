package com.qrcode.generator.controller;

import com.qrcode.generator.dto.qrcodeDTO.QrCodeGenerateRequest;
import com.qrcode.generator.dto.qrcodeDTO.QrCodeGenerateResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/qrcode")
public class QrCodeController {

    @PostMapping
    public ResponseEntity<QrCodeGenerateResponse> genarate(@RequestBody QrCodeGenerateRequest request) {
        return null;
    }

}
