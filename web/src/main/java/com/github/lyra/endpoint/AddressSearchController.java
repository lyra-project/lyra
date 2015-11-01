package com.github.lyra.endpoint;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.github.lyra.model.Address;

@SuppressWarnings("nls")
@RestController
public class AddressSearchController {
  @RequestMapping(value = "/search", produces = MediaType.APPLICATION_JSON_VALUE)
  public Address search(@RequestParam(value = "address") String address) {
    return new Address("Rinterheimer Str", "Germany", "Karlsruhe", "76131", 42.23, 91.45);
	}
}
