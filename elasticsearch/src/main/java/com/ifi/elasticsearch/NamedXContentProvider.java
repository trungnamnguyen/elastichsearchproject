package com.ifi.elasticsearch;

import org.elasticsearch.common.xcontent.NamedXContentRegistry;

import java.util.List;

public interface NamedXContentProvider {
    List<NamedXContentRegistry.Entry> getNamedXContentParsers();
}
