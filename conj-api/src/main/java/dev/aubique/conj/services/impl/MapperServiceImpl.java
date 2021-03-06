package dev.aubique.conj.services.impl;

import dev.aubique.conj.mapper.DefaultMapper;
import dev.aubique.conj.mapper.impl.MaxMapper;
import dev.aubique.conj.mapper.impl.MinMapper;
import dev.aubique.conj.model.VerbEntity;
import dev.aubique.conj.model.dto.VerbDto;
import dev.aubique.conj.services.MapperService;
import org.springframework.stereotype.Service;

@Service
public class MapperServiceImpl implements MapperService<VerbEntity, VerbDto> {

    @Override
    public VerbDto mapToMax(VerbEntity verbObject) {
        final DefaultMapper mapper = new MaxMapper(verbObject);

        return mapper.map();
    }

    @Override
    public VerbDto mapToMin(VerbEntity verbObject) {
        final DefaultMapper mapper = new MinMapper(verbObject);

        return mapper.map();
    }
}
