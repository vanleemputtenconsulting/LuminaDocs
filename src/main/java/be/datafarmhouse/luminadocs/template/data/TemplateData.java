package be.datafarmhouse.luminadocs.template.data;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class TemplateData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String code;
    private String name;


    @ManyToOne(fetch = FetchType.EAGER)
    private CSSData css;
    private TemplateEngineData templateEngine;
    private PDFEngineData pdfEngine;


    @Lob
    private String content;
    @Lob
    private String testVars;
}
