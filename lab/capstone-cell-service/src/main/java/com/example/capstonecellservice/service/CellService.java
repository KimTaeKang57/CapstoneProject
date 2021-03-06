package com.example.capstonecellservice.service;

import com.example.capstonecellservice.dto.CellDto;
import com.example.capstonecellservice.dto.FlaskResponseDto;
import com.example.capstonecellservice.jpa.CellEntity;
import org.json.simple.parser.ParseException;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public interface CellService {

    CellDto createCell(CellDto cellDto, FlaskResponseDto flaskResponseDto) throws IOException, ParseException;

    CellDto getOneCellByCellId(String cellId); // cellId 통해 cell 정보 get

    Iterable<CellEntity> getCellsByUserId(String userId); // userId 통해 cell 정보들 get

    void deleteCellByUserId(String userId); // userId 통해 cell 전체 삭제

    void deleteCellByUserIdAndCellId(String userId, String cellId); // userId와 cellId 통해 해당하는 cell 삭제
}
