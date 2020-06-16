package edu.miu.cs.cs425.eshopping.controller;

import edu.miu.cs.cs425.eshopping.model.Order;
import edu.miu.cs.cs425.eshopping.service.OrderService;
import edu.miu.cs.cs425.eshopping.util.GeneratePdf;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
public class PdfExportController {

    @Autowired
    OrderService orderService;

    @RequestMapping(value = "/orderreceipt/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_PDF_VALUE)
    public ResponseEntity<InputStreamResource> orderReceipt(@PathVariable("id") Long id) throws IOException {
        Order order = orderService.getOrder(id);
        List<Order> orders = new ArrayList<>();
        orders.add(order);

        ByteArrayInputStream bis = GeneratePdf.orderReport(orders);

        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Disposition", "inline; filename=orderreceipt.pdf");

        return ResponseEntity
                .ok()
                .headers(headers)
                .contentType(MediaType.APPLICATION_PDF)
                .body(new InputStreamResource(bis));
    }
}