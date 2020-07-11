package com.iotexam.domain;

import com.iotexam.Repositories.VariableClusterMongoRepository;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Iterator;
import java.util.List;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TransforDataFromExcelToDB {

    @Autowired
    private VariableClusterMongoRepository variableClusterMongoRepository;

    private static final String FILE_NAME = "C:/Personal/MyProjects/variable4.xlsx";

    final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSSSSS");

    @Test
    public void testForDB() {

        try {

            FileInputStream excelFile = new FileInputStream(new File(FILE_NAME));
            Workbook workbook = new XSSFWorkbook(excelFile);
            Sheet datatypeSheet = workbook.getSheetAt(0);
            Iterator<Row> iterator = datatypeSheet.iterator();

            while (iterator.hasNext()) {

                Row currentRow = iterator.next();
                Iterator<Cell> cellIterator = currentRow.iterator();

                VariableCluster variableCluster = new VariableCluster();

                while (cellIterator.hasNext()) {

                    Cell nextCell = cellIterator.next();

                    int columnIndex = nextCell.getColumnIndex();

                    switch (columnIndex) {
                        case 0:
                            String id =  nextCell.getStringCellValue();
                            variableCluster.setId(id);
                            break;
                        case 1:
                            Long idForRow = (long) nextCell.getNumericCellValue();
                            variableCluster.setRowId(idForRow);
                            break;
                        case 2:
                            String aValue =  nextCell.getStringCellValue();
                            variableCluster.setAvalue(aValue);
                            break;
                        case 3:
                            int addressOut =  (int) nextCell.getNumericCellValue();
                            variableCluster.setAddressout(addressOut);
                            break;
                        case 4:
                            Integer addressIn = (int) nextCell.getNumericCellValue();
                            variableCluster.setAddressin(addressIn);
                            break;
                        case 5:
                            String bValue =  nextCell.getStringCellValue();
                            variableCluster.setBvalue(bValue);
                            break;
                        case 6:
                            Integer bitPosition = (int) nextCell.getNumericCellValue();
                            variableCluster.setBitPosition(bitPosition);
                            break;
                        case 7:
                            String buttonPath =  nextCell.getStringCellValue();
                            variableCluster.setButtonPath(buttonPath);
                            break;
                        case 8:
                            String code =  nextCell.getStringCellValue();
                            variableCluster.setCode(code);
                            break;
                        case 9:
                            Boolean decimal =  Boolean.parseBoolean(nextCell.getStringCellValue());
                            variableCluster.setDecimal(decimal);
                            break;
                        case 10:
                            Integer defaultValue = (int) nextCell.getNumericCellValue();
                            variableCluster.setDefaultValue(defaultValue);
                            break;
                        case 11:
                            Integer delay = (int) nextCell.getNumericCellValue();
                            variableCluster.setDelay(delay);
                            break;
                        case 12:
                            Integer delta = (int) nextCell.getNumericCellValue();
                            variableCluster.setDelta(delta);
                            break;
                        case 13:
                            String description =  nextCell.getStringCellValue();
                            variableCluster.setDescription(description);
                            break;
                        case 14:
                            Integer dimension = (int) nextCell.getNumericCellValue();
                            variableCluster.setDimension(dimension);
                            break;
                        case 15:
                            Integer frequency = (int) nextCell.getNumericCellValue();
                            variableCluster.setFrequency(frequency);
                            break;
                        case 16:
                            String functionCode =  nextCell.getStringCellValue();
                            variableCluster.setFunctionCode(functionCode);
                            break;
                        case 17:
                            Integer grpCategory = (int) nextCell.getNumericCellValue();
                            variableCluster.setGrpCategory(grpCategory);
                            break;
                        case 18:
                            Integer idGroup = (int) nextCell.getNumericCellValue();
                            variableCluster.setIdGroup(idGroup);
                            break;
                        case 19:
                            Integer idHshVariable = (int) nextCell.getNumericCellValue();
                            variableCluster.setIdHshVariable(idHshVariable);
                            break;
                        case 20:
                            Integer idVarmdl = (int) nextCell.getNumericCellValue();
                            variableCluster.setIdVarmdl(idVarmdl);
                            break;
                        case 21:
                            Integer idVariable = (int) nextCell.getNumericCellValue();
                            variableCluster.setIdVariable(idVariable);
                            break;
                        case 22:
                            String imageOff =  nextCell.getStringCellValue();
                            variableCluster.setImageOff(imageOff);
                            break;
                        case 23:
                            String imageOn =  nextCell.getStringCellValue();
                            variableCluster.setImageon(imageOn);
                            break;
                        case 24:
                            String dateString = nextCell.getStringCellValue();
                            //String pureDateString =  dateString.substring(0, dateString.length() - 1);
                            //String pureDateString = "22-01-2015 10:15:55 AM";
                            LocalDateTime localDateTime = LocalDateTime.from(formatter.parse(dateString));
                            variableCluster.setInsertTime(localDateTime);
                            break;
                        case 25:
                            Boolean isActive =  Boolean.parseBoolean(nextCell.getStringCellValue());
                            variableCluster.setIsActive(isActive);
                            break;
                        case 26:
                            Boolean isCancelled =  Boolean.parseBoolean(nextCell.getStringCellValue());
                            variableCluster.setIsCancelled(isCancelled);
                            break;
                        case 27:
                            Boolean isHaccp =  Boolean.parseBoolean(nextCell.getStringCellValue());
                            variableCluster.setIsHaccp(isHaccp);
                            break;
                        case 28:
                            Boolean isLogic =  Boolean.parseBoolean(nextCell.getStringCellValue());
                            variableCluster.setIsLogic(isLogic);
                            break;
                        case 29:
                            Boolean isOnChange =  Boolean.parseBoolean(nextCell.getStringCellValue());
                            variableCluster.setIsOnchange(isOnChange);
                            break;
                        case 30:
                            LocalDateTime lastUpdate = LocalDateTime.from(formatter.parse(nextCell.getStringCellValue()));
                            variableCluster.setLastUpdate(lastUpdate);
                            break;
                        case 31:
                            Integer length = (int) nextCell.getNumericCellValue();
                            variableCluster.setLength(length);
                            break;
                        case 32:
                            String maximum = nextCell.getStringCellValue();
                            variableCluster.setMaximum(maximum);
                            break;
                        case 33:
                            String measureUnit = nextCell.getStringCellValue();
                            variableCluster.setMeausereUnit(measureUnit);
                            break;
                        case 34:
                            String minimum = nextCell.getStringCellValue();
                            variableCluster.setMinimum(minimum);
                            break;
                        case 35:
                            Integer priority = (int)  nextCell.getNumericCellValue();
                            variableCluster.setPriority(priority);
                            break;
                        case 36:
                            Integer readWrite = (int)  nextCell.getNumericCellValue();
                            variableCluster.setReadWrite(readWrite);
                            break;
                        case 37:
                            Boolean signed = Boolean.parseBoolean(nextCell.getStringCellValue());
                            variableCluster.setSigned(signed);
                            break;
                        case 38:
                            String toDisplay = nextCell.getStringCellValue();
                            variableCluster.setToDisplay(toDisplay);
                            break;
                        case 39:
                            Integer type = (int) nextCell.getNumericCellValue();
                            variableCluster.setType(type);
                            break;
                        case 40:
                            String varEncoding = nextCell.getStringCellValue();
                            variableCluster.setVarEncoding(varEncoding);
                            break;
                        case 41:
                            String detailId = nextCell.getStringCellValue();
                            variableCluster.setDetailId(detailId);
                            break;
                        case 42:
                            String deviceModel = nextCell.getStringCellValue();
                            variableCluster.setDeviceModel(deviceModel);
                            break;
                    }

                }
                variableClusterMongoRepository.save(variableCluster);

                List<VariableCluster> variableClusterA = variableClusterMongoRepository.findAll();
                assertNotNull(variableClusterA);

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
