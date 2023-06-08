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

class PrivilegeBag
{
    static public $isValidate = false;

    static public $_TSPEC = array(
        1 => array(
            'var' => 'privileges',
            'isRequired' => false,
            'type' => TType::LST,
            'etype' => TType::STRUCT,
            'elem' => array(
                'type' => TType::STRUCT,
                'class' => '\metastore\HiveObjectPrivilege',
                ),
        ),
    );

    /**
     * @var \metastore\HiveObjectPrivilege[]
     */
    public $privileges = null;

    public function __construct($vals = null)
    {
        if (is_array($vals)) {
            if (isset($vals['privileges'])) {
                $this->privileges = $vals['privileges'];
            }
        }
    }

    public function getName()
    {
        return 'PrivilegeBag';
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
                        $this->privileges = array();
                        $_size99 = 0;
                        $_etype102 = 0;
                        $xfer += $input->readListBegin($_etype102, $_size99);
                        for ($_i103 = 0; $_i103 < $_size99; ++$_i103) {
                            $elem104 = null;
                            $elem104 = new \metastore\HiveObjectPrivilege();
                            $xfer += $elem104->read($input);
                            $this->privileges []= $elem104;
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
        $xfer += $output->writeStructBegin('PrivilegeBag');
        if ($this->privileges !== null) {
            if (!is_array($this->privileges)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('privileges', TType::LST, 1);
            $output->writeListBegin(TType::STRUCT, count($this->privileges));
            foreach ($this->privileges as $iter105) {
                $xfer += $iter105->write($output);
            }
            $output->writeListEnd();
            $xfer += $output->writeFieldEnd();
        }
        $xfer += $output->writeFieldStop();
        $xfer += $output->writeStructEnd();
        return $xfer;
    }
}
