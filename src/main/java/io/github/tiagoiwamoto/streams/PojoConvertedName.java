package io.github.tiagoiwamoto.streams;

import lombok.Builder;

@Builder
public record PojoConvertedName(
        String fullName
) {
}
