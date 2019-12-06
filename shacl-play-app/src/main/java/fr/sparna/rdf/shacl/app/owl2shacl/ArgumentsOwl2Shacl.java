package fr.sparna.rdf.shacl.app.owl2shacl;

import java.io.File;
import java.util.List;

import com.beust.jcommander.Parameter;
import com.beust.jcommander.Parameters;

import fr.sparna.rdf.shacl.owl2shacl.Owl2Shacl.Owl2ShaclStyle;

@Parameters(commandDescription = "Converts an OWL ontology into a SHACL file, in a specified 'conversion style'")
public class ArgumentsOwl2Shacl {
	
	@Parameter(
			names = { "-i", "--input" },
			description = "Path to a local RDF file",
			required = true,
			variableArity = true
	)
	private List<File> input;

	@Parameter(
			names = { "-o", "--output" },
			description = "Path to the output file",
			required = true
	)
	private File output;
	
	@Parameter(
			names = { "-s", "--style" },
			description = "Style of conversion. Defaults to 'SIMPLE'",
			required = false
	)
	private Owl2ShaclStyle style = Owl2ShaclStyle.SIMPLE;

	public List<File> getInput() {
		return input;
	}

	public void setInput(List<File> input) {
		this.input = input;
	}

	public File getOutput() {
		return output;
	}

	public void setOutput(File output) {
		this.output = output;
	}

	public Owl2ShaclStyle getStyle() {
		return style;
	}

	public void setStyle(Owl2ShaclStyle style) {
		this.style = style;
	}
	
}
