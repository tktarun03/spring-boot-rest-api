package com.example.demo.controller;

import com.example.demo.model.Item;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/items")
public class ItemController {
    private List<Item> items = new ArrayList<>();

    @GetMapping
    public List<Item> getItems() {
        return items;
    }

    @PostMapping
    public Item addItem(@RequestBody Item item) {
        items.add(item);
        return item;
    }
}
