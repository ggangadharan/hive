<?php
namespace metastore;

/**
 * Autogenerated by Thrift Compiler (0.16.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
use Thrift\Base\TBase;
use Thrift\Type\TType;
use Thrift\Type\TMessageType;
use Thrift\Exception\TException;
use Thrift\Exception\TProtocolException;
use Thrift\Protocol\TProtocol;
use Thrift\Protocol\TBinaryProtocolAccelerated;
use Thrift\Exception\TApplicationException;

class ShowCompactResponse
{
    static public $isValidate = false;

    static public $_TSPEC = array(
        1 => array(
            'var' => 'compacts',
            'isRequired' => true,
            'type' => TType::LST,
            'etype' => TType::STRUCT,
            'elem' => array(
                'type' => TType::STRUCT,
                'class' => '\metastore\ShowCompactResponseElement',
                ),
        ),
    );

    /**
     * @var \metastore\ShowCompactResponseElement[]
     */
    public $compacts = null;

    public function __construct($vals = null)
    {
        if (is_array($vals)) {
            if (isset($vals['compacts'])) {
                $this->compacts = $vals['compacts'];
            }
        }
    }

    public function getName()
    {
        return 'ShowCompactResponse';
    }


    public function read($input)
    {
        $xfer = 0;
        $fname = null;
        $ftype = 0;
        $fid = 0;
        $xfer += $input->readStructBegin($fname);
        while (true) {
            $xfer += $input->readFieldBegin($fname, $ftype, $fid);
            if ($ftype == TType::STOP) {
                break;
            }
            switch ($fid) {
                case 1:
                    if ($ftype == TType::LST) {
                        $this->compacts = array();
                        $_size797 = 0;
                        $_etype800 = 0;
                        $xfer += $input->readListBegin($_etype800, $_size797);
                        for ($_i801 = 0; $_i801 < $_size797; ++$_i801) {
                            $elem802 = null;
                            $elem802 = new \metastore\ShowCompactResponseElement();
                            $xfer += $elem802->read($input);
                            $this->compacts []= $elem802;
                        }
                        $xfer += $input->readListEnd();
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                default:
                    $xfer += $input->skip($ftype);
                    break;
            }
            $xfer += $input->readFieldEnd();
        }
        $xfer += $input->readStructEnd();
        return $xfer;
    }

    public function write($output)
    {
        $xfer = 0;
        $xfer += $output->writeStructBegin('ShowCompactResponse');
        if ($this->compacts !== null) {
            if (!is_array($this->compacts)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('compacts', TType::LST, 1);
            $output->writeListBegin(TType::STRUCT, count($this->compacts));
            foreach ($this->compacts as $iter803) {
                $xfer += $iter803->write($output);
            }
            $output->writeListEnd();
            $xfer += $output->writeFieldEnd();
        }
        $xfer += $output->writeFieldStop();
        $xfer += $output->writeStructEnd();
        return $xfer;
    }
}
