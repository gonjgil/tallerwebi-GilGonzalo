package com.tallerwebi.TDD;

import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalToIgnoringCase;

public class ValidadorDeContraseniaTest {

    @Test
    public void queDevuelvaINVALIDACuandoSeaSoloUnCaracter() {
        ValidadorDeContrasenia validador = new ValidadorDeContrasenia("1");
        String fortaleza = validador.evaluarFortaleza();

        assertThat(fortaleza, equalToIgnoringCase("INVALIDA"));
    }

    @Test
    public void queDevuelvaDEBILCuandoLaConstraseniaEsGon741o() {
        ValidadorDeContrasenia validador = new ValidadorDeContrasenia("Gon741o");
        String fortaleza = validador.evaluarFortaleza();

        assertThat(fortaleza, equalToIgnoringCase("DEBIL"));
    }

    @Test
    public void queDevuelvaMEDIANACuandoLaConstraseniaEsGon7410() {
        ValidadorDeContrasenia validador = new ValidadorDeContrasenia("Gon74108");
        String fortaleza = validador.evaluarFortaleza();

        assertThat(fortaleza, equalToIgnoringCase("MEDIANA"));
    }
}
