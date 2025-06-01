package io.github.tiagoiwamoto.streams;

import lombok.Builder;

@Builder
public record PojoName(
        String name,
        String lastName
) {
}
