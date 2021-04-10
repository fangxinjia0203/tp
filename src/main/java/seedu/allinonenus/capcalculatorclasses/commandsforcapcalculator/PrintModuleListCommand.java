package seedu.allinonenus.capcalculatorclasses.commandsforcapcalculator;

import seedu.allinonenus.capcalculatorclasses.logicforcapcalculator.ModuleList;
import seedu.allinonenus.capcalculatorclasses.storageforcapcalculator.ModuleStorage;
import seedu.allinonenus.capcalculatorclasses.uiforcapcalculator.UiText;

public class PrintModuleListCommand extends CommandsForCapCalculator {

    public PrintModuleListCommand() {
        super();
    }

    public void executeCommand(ModuleList moduleList, ModuleStorage storage, UiText uiText, String fullCommand){
        int currentSem = storage.currentSem;
        uiText.separationLine();
        String semINFO = moduleList.printYearAndSem(currentSem);

        uiText.currentSemView(semINFO);
        if (modulesExist(moduleList,currentSem)) {

            uiText.printModuleDataHeading();

            listModulesForSem(moduleList,currentSem,uiText);

            uiText.separationLine();

            uiText.printCurrentSemCap(moduleList.calculate(currentSem, currentSem));
            uiText.printOverallCap(moduleList.calculate(1,currentSem));

        } else {
            uiText.warnUserOfEmptySemester();
            uiText.separationLine();
        }
    }

    public boolean isExit(){
        return exit;
    }

    public boolean modulesExist(ModuleList moduleList,int currentSem) {
        boolean exists = false;
        for (int i = 0; i < moduleList.size(); i++) {
            if (moduleList.get(i).sem == currentSem) {
                exists = true;
            }
        }
        return exists;
    }

    public void listModulesForSem(ModuleList moduleList,int currentSem,UiText uiText){
        for (int i = 0; i < moduleList.size(); i++) {

            if (moduleList.get(i).sem == currentSem) {
                uiText.printModuleData(moduleList.get(i).moduleCode,moduleList.get(i).grade,moduleList.get(i).mcs);
            }
        }
    }

}