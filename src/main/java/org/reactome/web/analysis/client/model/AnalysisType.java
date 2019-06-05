package org.reactome.web.analysis.client.model;

/**
 * @author Antonio Fabregat <fabregat@ebi.ac.uk>
 */
public enum AnalysisType {

    NONE,
    SPECIES_COMPARISON,
    DATASET_COMPARISON,
    OVERREPRESENTATION,
    EXPRESSION,
    GSA_REGULATION, //DISCRETE values in the "expression" for pathways (proteins will contain normal expression values)
    GSA_STATISTICS,
    GSVA;

    public static AnalysisType getType(String type){
        if(type==null) return  null;
        for (AnalysisType t : values()) {
            if(t.toString().toLowerCase().equals(type.toLowerCase())){
                return t;
            }
        }
        return NONE;
    }
}
